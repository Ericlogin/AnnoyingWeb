from django.urls import path
from . import views

urlpatterns = [
    path('', views.notification, name='blog-notification'),
    path('about/', views.about, name='blog-about'),
    path('notification/', views.home, name='blog-home'),
    path('byTime/', views.byTime, name='blog-byTime'),
    path('byName/', views.byName, name='blog-byName'),
]
