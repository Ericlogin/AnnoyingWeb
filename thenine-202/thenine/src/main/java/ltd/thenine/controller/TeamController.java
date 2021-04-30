package ltd.thenine.controller;


import com.alibaba.fastjson.JSONObject;
import ltd.thenine.entity.Team;
import ltd.thenine.entity.Team_PoRel;
import ltd.thenine.entity.Team_PrRel;
import ltd.thenine.entity.Team_SkRel;
import ltd.thenine.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("team")
public class TeamController {

    @Autowired
    private ITeam_SkRelService iTeam_skRelService;
    @Autowired
    private ITeam_PoRelService iTeam_poRelService;
    @Autowired
    private ITeam_PrRelService iTeam_prRelService;
    @Autowired
    private ITeam_imageService iTeam_imageService;
    @Autowired
    private ITeamService iTeamService;


    // 根据三个条件筛选
    @PostMapping("filter")
    private String filter(@RequestBody JSONObject jsonObject){

        int skid = (int) jsonObject.get("skill_id");
        int prid = (int) jsonObject.get("program_id");
        int poid = (int) jsonObject.get("position_id");

        List<Team> matched_teams = new ArrayList<>();

        if (skid == 0 && prid == 0 && poid == 0) {
            // 没有筛选条件
            matched_teams = iTeamService.selectAll();
        } else if (skid != 0 && prid == 0 && poid == 0) {
            // 只有一个skill筛选条件
            List<Team_SkRel> sk_team = iTeam_skRelService.searchTeam(skid);
            for (Team_SkRel team_skRel : sk_team) {
                matched_teams.add(iTeamService.selectTeam(team_skRel.getTeam_id()));
            }
        } else if (skid == 0 && prid != 0 && poid == 0) {
            // 只有一个program筛选条件
            List<Team_PrRel> pr_team = iTeam_prRelService.searchTeam(prid);
            for (Team_PrRel team_prRel : pr_team) {
                matched_teams.add(iTeamService.selectTeam(team_prRel.getTeam_id()));
            }
        } else if (skid == 0 && prid == 0 && poid != 0) {
            // 只有一个position筛选条件
            List<Team_PoRel> po_team = iTeam_poRelService.searchTeam(poid);
            for (Team_PoRel team_poRel : po_team) {
                matched_teams.add(iTeamService.selectTeam(team_poRel.getTeam_id()));
            }
        } else if (skid != 0 && prid != 0 && poid == 0) {
            // 有skill和program两个筛选条件
            List<Team_SkRel> sk_team = iTeam_skRelService.searchTeam(skid);
            List<Team_PrRel> pr_team = iTeam_prRelService.searchTeam(prid);
            if ( !(sk_team.size() == 0 || pr_team.size() == 0)) {
                for (Team_SkRel team_skRel : sk_team) {
                    int id = team_skRel.getTeam_id();
                    for (Team_PrRel team_prRel : pr_team) {
                        if (id == team_prRel.getTeam_id()) {
                            matched_teams.add(iTeamService.selectTeam(id));
                            break;
                        }
                    }
                }
            }
        } else if (skid != 0 && prid == 0 && poid != 0) {
            // 有skill和position两个筛选条件
            List<Team_SkRel> sk_team = iTeam_skRelService.searchTeam(skid);
            List<Team_PoRel> po_team = iTeam_poRelService.searchTeam(poid);
            if ( !(sk_team.size() == 0 || po_team.size() == 0)) {
                for (Team_SkRel team_skRel : sk_team) {
                    int id = team_skRel.getTeam_id();
                    for (Team_PoRel team_poRel : po_team) {
                        if (id == team_poRel.getTeam_id()) {
                            matched_teams.add(iTeamService.selectTeam(id));
                            break;
                        }
                    }
                }
            }
        } else if (skid == 0 && prid != 0 && poid != 0) {
            // 有program和position两个筛选条件
            List<Team_PrRel> pr_team = iTeam_prRelService.searchTeam(prid);
            List<Team_PoRel> po_team = iTeam_poRelService.searchTeam(poid);
            if ( !(pr_team.size() == 0 || po_team.size() == 0)) {
                for (Team_PrRel team_prRel : pr_team) {
                    int id = team_prRel.getTeam_id();
                    for (Team_PoRel team_poRel : po_team) {
                        if (id == team_poRel.getTeam_id()) {
                            matched_teams.add(iTeamService.selectTeam(id));
                            break;
                        }
                    }
                }
            }
        } else if (skid != 0 && prid != 0 && poid != 0) {
            // 有skill和position两个筛选条件
            List<Team_SkRel> sk_team = iTeam_skRelService.searchTeam(skid);
            List<Team_PrRel> pr_team = iTeam_prRelService.searchTeam(prid);
            List<Team_PoRel> po_team = iTeam_poRelService.searchTeam(poid);
            if ( !(sk_team.size() == 0 || po_team.size() == 0)) {
                for (Team_SkRel team_skRel : sk_team) {
                    int id = team_skRel.getTeam_id();
                    for (Team_PoRel team_poRel : po_team) {
                        if (id == team_poRel.getTeam_id()) {
                            for (Team_PrRel team_prRel : pr_team) {
                                if (id == team_prRel.getTeam_id()) {
                                    matched_teams.add(iTeamService.selectTeam(id));
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }

        JSONObject ret = new JSONObject();
        if (matched_teams.size() == 0) {
            return ret.toJSONString();
        } else {
            int i = 0;
            for (Team team : matched_teams) {
                JSONObject eachTeam = new JSONObject();
                eachTeam.put("team_id", team.getTeam_id());
                eachTeam.put("leader_name", team.getLeader_name());
                eachTeam.put("name", team.getName());
                eachTeam.put("scope", team.getScope());
                eachTeam.put("image_url", iTeam_imageService.selectImg(team.getImage_id()).getImage_url());
                ret.put(String.valueOf(i), eachTeam);
                i++;
            }
            return  ret.toJSONString();
        }




    }

    /**
     * 获取所有队伍
     */
    @GetMapping("get_all_team")
    public String getall(){
        List<Team> matched_teams = iTeamService.selectAll();
        JSONObject ret = new JSONObject();
        if (matched_teams.size() == 0) {
            return ret.toJSONString();
        } else {
            int i = 0;
            for (Team team : matched_teams) {
                JSONObject eachTeam = new JSONObject();
                eachTeam.put("team_id", team.getTeam_id());
                eachTeam.put("leader_name", team.getLeader_name());
                eachTeam.put("name", team.getName());
                eachTeam.put("scope", team.getScope());
                eachTeam.put("image_url", iTeam_imageService.selectImg(team.getImage_id()).getImage_url());
                JSONObject skills = new JSONObject();
                List<Team_SkRel> team_skRel = iTeam_skRelService.searchSkill(team.getTeam_id());
                for (int j = 0; j < team_skRel.size(); j++) {
                    skills.put(String.valueOf(i), team_skRel.get(i).getSkill_id());
                }
                ret.put(String.valueOf(i), eachTeam);
                i++;
            }
            return  ret.toJSONString();
    }


}
