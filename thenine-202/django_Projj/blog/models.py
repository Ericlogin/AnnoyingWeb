from django.db import models
from django.utils import timezone
from django.contrib.auth.models import User
from django.urls import reverse



class Post(models.Model):
	teamLeader = models.CharField(max_length=100)
	teamName = models.TextField(default='')
	teamID = models.TextField(default='')
	numOfPeople = models.IntegerField(default=0)
	stillNeed = models.IntegerField(default=9)
	skills = models.TextField(default='')
	date = models.DateTimeField(default=timezone.now)
	user = models.ForeignKey(User, on_delete=models.CASCADE)
	

	def __str__(self):
		return self.teamLeader

	def get_absolute_url(self):
		return reverse('post-detail', kwargs={'pk': self.pk})






















