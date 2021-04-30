from django.shortcuts import render
from django.http import HttpResponse
from django.contrib.auth.decorators import login_required

posts = [
	{
		'teamLeader': 'Juncheng Liu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'skills': 'Java, python',
		'date': 'Mar 5,2021'
	},
	{
		'teamLeader': 'Wenzhuo Sun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 3,
		'stillNeed': 6,
		'skills': 'C++, python, matlab',
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'Junzhan Zhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'skills': 'C++, matlab',
		'date': 'Mar 3, 2021'
	},
	{
		'teamLeader': 'Qiu Jing',
		'teamName': 'YYDS',
		'teamID': '777777',
		'numberOfPeople': 3,
		'stillNeed': 6,
		'skills': 'python',
		'date': 'Apr 26, 2021'
	}

]

posts2 = [
	{
		'teamLeader': 'Junzhan Zhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'skills': 'C++, matlab',
		'date': 'Mar 3, 2021'
	},
	{
		'teamLeader': 'Juncheng Liu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'skills': 'Java, python',
		'date': 'Mar 5,2021'
	},
	{
		'teamLeader': 'Wenzhuo Sun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 8,
		'stillNeed': 1,
		'skills': 'C++, python, matlab',
		'date': 'Mar 7, 2021'
	}
]

posts3 = [
	{
		'teamLeader': 'Junzhan Zhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'skills': 'C++, matlab',
		'date': 'Mar 3, 2021'
	},
	{
		'teamLeader': 'Wenzhuo Sun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 8,
		'stillNeed': 1,
		'skills': 'C++, python, matlab',
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'Juncheng Liu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'skills': 'Java, python',
		'date': 'Mar 5,2021'
	}
]

postsJ = [
	{
		'teamLeader': 'Juncheng Liu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'skills': 'Java, python',
		'date': 'Mar 5,2021'
	}
]

postsP = [
	{
		'teamLeader': 'Wenzhuo Sun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 3,
		'stillNeed': 6,
		'skills': 'C++, python, matlab',
		'date': 'Mar 7, 2021'
	},
	{
		'teamLeader': 'Juncheng Liu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'skills': 'Java, python',
		'date': 'Mar 5,2021'
	}
]

postsC = [
	{
		'teamLeader': 'Junzhan Zhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'skills': 'C++, matlab',
		'date': 'Mar 3, 2021'
	},
	{
		'teamLeader': 'Wenzhuo Sun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 8,
		'stillNeed': 1,
		'skills': 'C++, python, matlab',
		'date': 'Mar 7, 2021'
	}
]

postsM = [
	{
		'teamLeader': 'Junzhan Zhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'skills': 'C++, matlab',
		'date': 'Mar 3, 2021'
	},
	{
		'teamLeader': 'Wenzhuo Sun',
		'teamName': 'Hello World',
		'teamID': '34575',
		'numberOfPeople': 3,
		'stillNeed': 6,
		'skills': 'C++, python, matlab',
		'date': 'Mar 7, 2021'
	}
]
postsH = [
	{
		'teamLeader': 'Juncheng Liu',
		'teamName': 'The 9',
		'teamID': '23464',
		'numberOfPeople': 9,
		'stillNeed': 0,
		'skills': 'Java, python',
		'date': 'Mar 5,2021'
	},
	{
		'teamLeader': 'Junzhan Zhang',
		'teamName': 'Apple Inc.',
		'teamID': '666666',
		'numberOfPeople': 4,
		'stillNeed': 5,
		'skills': 'C++, matlab',
		'date': 'Mar 3, 2021'
	},
	{
		'teamLeader': 'Qiu Jing',
		'teamName': 'YYDS',
		'teamID': '777777',
		'numberOfPeople': 3,
		'stillNeed': 6,
		'skills': 'python',
		'date': 'Apr 26, 2021'
	}
]

def home(request):
	return render(request, 'blog/notification.html')

@login_required
def default(request):
	context = {
		'posts': posts
		}
	return render(request, 'blog/default.html', context)

@login_required
def defaultH(request):
	context = {
		'postsH': postsH
		}
	return render(request, 'blog/defaultH.html', context)

@login_required
def byTime(request):
	context = {
		'posts2': posts2
		}
	return render(request, 'blog/byTime.html', context)

@login_required
def byName(request):
	context = {
		'posts3': posts3
		}
	return render(request, 'blog/byName.html', context)

@login_required
def java(request):
	context = {
		'postsJ': postsJ
		}
	return render(request, 'blog/java.html', context)

@login_required
def python(request):
	context = {
		'postsP': postsP
		}
	return render(request, 'blog/python.html', context)

@login_required
def c(request):
	context = {
		'postsC': postsC
		}
	return render(request, 'blog/c.html', context)

@login_required
def matlab(request):
	context = {
		'postsM': postsM
		}
	return render(request, 'blog/matlab.html', context)

@login_required
def notices(request):
	return render(request, 'blog/notices.html')

@login_required
def detailsL(request):
	return render(request, 'blog/detailsL.html')

@login_required
def detailsL2(request):
	return render(request, 'blog/detailsL2.html')

@login_required
def detailsS(request):
	return render(request, 'blog/detailsS.html')

@login_required
def detailsSA(request):
	return render(request, 'blog/detailsSA.html')

@login_required
def detailsSA1(request):
	return render(request, 'blog/detailsSA1.html')

@login_required
def detailsSE(request):
	return render(request, 'blog/detailsSE.html')

@login_required
def detailsSH(request):
	return render(request, 'blog/detailsSH.html')

@login_required
def hiden(request):
	return render(request, 'blog/hiden.html')

def about(request):
	return render(request, 'blog/about.html', {'title': 'About'})

def notification(request):
	return render(request, 'blog/notification.html', {'title': 'Notification'})

@login_required
def analysis(request):
	return render(request, 'blog/analysis.html', {'title': 'analysis'})