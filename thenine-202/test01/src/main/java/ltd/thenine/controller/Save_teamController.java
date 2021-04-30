package ltd.thenine.controller;

import ltd.thenine.entity.Team_info;
import ltd.thenine.service.ISave_teamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/save_team_info")
public class Save_teamController {
    @Autowired
    private ISave_teamService iSave_team_Service;
    @RequestMapping(value = "/save_team_info",method = RequestMethod.POST)
    private int save_team(@RequestBody Team_info team_info){
        int num=iSave_team_Service.save_team(team_info.team);
        if(num==0){
            return 0;
        }
        if(num==-1){
            return -1;
        }
        iSave_team_Service.save_team_poRel(team_info.team,team_info.team_poRel);
        for(int i=0;i<num;i++){
            iSave_team_Service.save_team_prRel(team_info.team,team_info.team_prRel);
            iSave_team_Service.save_team_skRel(team_info.team,team_info.team_skRel);
        }
        return 1;
    }
}
