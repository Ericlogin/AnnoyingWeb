from django.urls import path
from . import views
from .views import (
    PostListView, 
    PostDetailView, 
    PostCreateView,
    PostUpdateView,
    PostDeleteView,
)

urlpatterns = [
    path('', views.notification, name='blog-notification'),
    path('about/', views.about, name='blog-about'),
    path('notice/', views.home, name='blog-home'),

    path('byTime/', views.byTime, name='blog-byTime'),
    path('byName/', views.byName, name='blog-byName'),

    path('default/', PostListView.as_view(), name='blog-default'),
    path('post/<int:pk>/', PostDetailView.as_view(), name='post-detail'),
    path('post/new/', PostCreateView.as_view(), name='post-create'),
    path('post/<int:pk>/update', PostUpdateView.as_view(), name='post-update'),
    path('post/<int:pk>/delete', PostDeleteView.as_view(), name='post-delete'),

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
