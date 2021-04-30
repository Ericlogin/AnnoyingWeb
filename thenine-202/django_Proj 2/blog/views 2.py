from django.shortcuts import render
from django.http import HttpResponse
from django.contrib.auth.decorators import login_required

posts = [
	{
		'teamLeader': 'JCLiu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'date': 'Mar 5,2021'
	},
	{
		'teamLeader': 'WZSun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 8,
		'stillNeed': 1,
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'JYZhang',
		'teamName': 'See You Tomorrow',
		'teamID': '4584634',
		'numberOfPeople': 7,
		'stillNeed': 2,
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'DYZhu',
		'teamName': 'YYDS',
		'teamID': '8753546',
		'numberOfPeople': 6,
		'stillNeed': 3,
		'date': 'Mar 15, 2021'
	},
	{
		'teamLeader': 'JQiu',
		'teamName': 'Oracle China',
		'teamID': '345236',
		'numberOfPeople': 5,
		'stillNeed': 4,
		'date': 'Mar 12, 2021'
	},
	{
		'teamLeader': 'JZZhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'date': 'Mar 3, 2021'
	}
]

posts2 = [
	{
		'teamLeader': 'JZZhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'date': 'Mar 3, 2021'
	},
	{
		'teamLeader': 'JCLiu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'date': 'Mar 5,2021'
	},
	{
		'teamLeader': 'WZSun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 8,
		'stillNeed': 1,
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'JYZhang',
		'teamName': 'See You Tomorrow',
		'teamID': '4584634',
		'numberOfPeople': 7,
		'stillNeed': 2,
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'JQiu',
		'teamName': 'Oracle China',
		'teamID': '345236',
		'numberOfPeople': 5,
		'stillNeed': 4,
		'date': 'Mar 12, 2021'
	},
	{
		'teamLeader': 'DYZhu',
		'teamName': 'YYDS',
		'teamID': '8753546',
		'numberOfPeople': 6,
		'stillNeed': 3,
		'date': 'Mar 15, 2021'
	}
]

posts3 = [
	{
		'teamLeader': 'JZZhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'date': 'Mar 3, 2021'
	},
	{
		'teamLeader': 'WZSun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 8,
		'stillNeed': 1,
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'JQiu',
		'teamName': 'Oracle China',
		'teamID': '345236',
		'numberOfPeople': 5,
		'stillNeed': 4,
		'date': 'Mar 12, 2021'
	},
	{
		'teamLeader': 'JYZhang',
		'teamName': 'See You Tomorrow',
		'teamID': '4584634',
		'numberOfPeople': 7,
		'stillNeed': 2,
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'JCLiu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'date': 'Mar 5,2021'
	},
	{
		'teamLeader': 'DYZhu',
		'teamName': 'YYDS',
		'teamID': '8753546',
		'numberOfPeople': 6,
		'stillNeed': 3,
		'date': 'Mar 15, 2021'
	}
]

def home(request):
	context = {
		'posts': posts
		}
	return render(request, 'blog/home.html', context)

def byTime(request):
	context = {
		'posts2': posts2
		}
	return render(request, 'blog/byTime.html', context)

def byName(request):
	context = {
		'posts3': posts3
		}
	return render(request, 'blog/byName.html', context)

def about(request):
	return render(request, 'blog/about.html', {'title': 'About'})

def notification(request):
	return render(request, 'blog/notification.html', {'title': 'Notification'})

@login_required
def hiden(request):
	return render(request, 'blog/hiden.html', {'title': 'Hiden'})

@login_required
def analysis(request):
	return render(request, 'blog/analysis.html', {'title': 'analysis'})