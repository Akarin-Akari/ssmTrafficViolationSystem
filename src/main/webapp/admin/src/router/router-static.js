import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xingshifangxiang from '@/views/modules/xingshifangxiang/list'
    import news from '@/views/modules/news/list'
    import chepaizhonglei from '@/views/modules/chepaizhonglei/list'
    import daduiguanli from '@/views/modules/daduiguanli/list'
    import cheliangleixing from '@/views/modules/cheliangleixing/list'
    import zhiduiguanli from '@/views/modules/zhiduiguanli/list'
    import kakoudianziweizhangxinxiguanli from '@/views/modules/kakoudianziweizhangxinxiguanli/list'
    import chufajuedingshu from '@/views/modules/chufajuedingshu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chufafangshi from '@/views/modules/chufafangshi/list'
    import weizhangxingwei from '@/views/modules/weizhangxingwei/list'
    import xingzhengquhua from '@/views/modules/xingzhengquhua/list'
    import yidongdianziweizhangxinxiguanli from '@/views/modules/yidongdianziweizhangxinxiguanli/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xingshifangxiang',
        name: '行驶方向',
        component: xingshifangxiang
      }
      ,{
	path: '/news',
        name: '公告',
        component: news
      }
      ,{
	path: '/chepaizhonglei',
        name: '车牌种类',
        component: chepaizhonglei
      }
      ,{
	path: '/daduiguanli',
        name: '大队管理',
        component: daduiguanli
      }
      ,{
	path: '/cheliangleixing',
        name: '车辆类型',
        component: cheliangleixing
      }
      ,{
	path: '/zhiduiguanli',
        name: '支队管理',
        component: zhiduiguanli
      }
      ,{
	path: '/kakoudianziweizhangxinxiguanli',
        name: '卡口电子违章信息管理',
        component: kakoudianziweizhangxinxiguanli
      }
      ,{
	path: '/chufajuedingshu',
        name: '处罚决定书',
        component: chufajuedingshu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chufafangshi',
        name: '处罚方式',
        component: chufafangshi
      }
      ,{
	path: '/weizhangxingwei',
        name: '违章行为',
        component: weizhangxingwei
      }
      ,{
	path: '/xingzhengquhua',
        name: '行政区划',
        component: xingzhengquhua
      }
      ,{
	path: '/yidongdianziweizhangxinxiguanli',
        name: '移动电子违章信息管理',
        component: yidongdianziweizhangxinxiguanli
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
