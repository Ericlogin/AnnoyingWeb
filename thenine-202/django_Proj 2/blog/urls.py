from django.urls import path
from . import views

urlpatterns = [
    path('', views.notification, name='blog-notification'),
    path('about/', views.about, name='blog-about'),
    path('notification/', views.home, name='blog-home'),
    path('byTime/', views.byTime, name='blog-byTime'),
    path('byName/', views.byName, name='blog-byName'),
    path('default/', views.default, name='blog-default'),
    path('java/', views.java, name='blog-java'),
    path('python/', views.python, name='blog-python'),
    path('c++/', views.c, name='blog-c'),
    path('matlab/', views.matlab, name='blog-matlab'),
    path('notices/', views.notices, name='blog-notices'),
    path('detailsL/', views.detailsL, name='blog-detailsL'),
    path('detailsL2/', views.detailsL2, name='blog-detailsL2'),
    path('detailsS/', views.detailsS, name='blog-detailsS'),
    path('detailsSA/', views.detailsSA, name='blog-detailsSA'),
    path('detailsSA1/', views.detailsSA1, name='blog-detailsSA1'),
    path('detailsSE/', views.detailsSE, name='blog-detailsSE'),
    path('detailsSH/', views.detailsSH, name='blog-detailsSH'),
    path('hiden/', views.hiden, name='blog-hiden'),
    path('defaultH/', views.defaultH, name='blog-defaultH'),
    path('analysis/', views.analysis, name='blog-analysis'),
]
