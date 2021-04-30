from django.shortcuts import render

def test1(request):
  return render(request,'app001/test1.html')

def index1(request):
    ans={}
    ans['head']='hello world'
    return render(request,'app001/firstpage.html',ans)