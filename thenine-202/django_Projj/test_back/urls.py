from django.conf.urls import url
from . import views

from django.conf.urls.static import static
from django.conf import settings


urlpatterns =[
    url(r'^$',views.test1,name='test1'), # app001首页显示“确定”按钮
    url(r'^/test1/',views.index1,name='index1'), # 匹配点击后传递回来的url
]+static(settings.STATIC_URL, document_root=settings.STATIC_ROOT)