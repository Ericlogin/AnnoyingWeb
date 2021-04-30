from django.db import models
from django.utils import timezone
from django.contrib.auth.models import User


class Post(models.Model):
	leader = models.CharField(max_length=100)
	teamID = models.TextField()
	numOfGroup = models.TextField()
	needed = models.IntegerField()
	time = models.DateTimeField(default=timezone.now)
	user = models.ForeignKey(User, on_delete=models.CASCADE)

	def __str__(self):
		return self.leader





















