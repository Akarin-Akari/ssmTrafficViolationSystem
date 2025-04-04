
var projectName = '智能道路交通管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '移动电子违章信息管理',
	url: './pages/yidongdianziweizhangxinxiguanli/list.html'
}, 
{
	name: '卡口电子违章信息管理',
	url: './pages/kakoudianziweizhangxinxiguanli/list.html'
}, 
{
	name: '支队管理',
	url: './pages/zhiduiguanli/list.html'
}, 
{
	name: '大队管理',
	url: './pages/daduiguanli/list.html'
}, 

{
	name: '公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm4ir8r/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","打印","报表"],"menu":"移动电子违章信息管理","menuJump":"列表","tableName":"yidongdianziweizhangxinxiguanli"}],"menu":"移动电子违章信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表","打印"],"menu":"卡口电子违章信息管理","menuJump":"列表","tableName":"kakoudianziweizhangxinxiguanli"}],"menu":"卡口电子违章信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"违章行为","menuJump":"列表","tableName":"weizhangxingwei"}],"menu":"违章行为管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"车辆类型","menuJump":"列表","tableName":"cheliangleixing"}],"menu":"车辆类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"支队管理","menuJump":"列表","tableName":"zhiduiguanli"}],"menu":"支队管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"大队管理","menuJump":"列表","tableName":"daduiguanli"}],"menu":"大队管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"车牌种类","menuJump":"列表","tableName":"chepaizhonglei"}],"menu":"车牌种类管理"},{"child":[{"buttons":["新增","查看","修改","删除","打印"],"menu":"处罚决定书","menuJump":"列表","tableName":"chufajuedingshu"}],"menu":"处罚决定书管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"行政区划","menuJump":"列表","tableName":"xingzhengquhua"}],"menu":"行政区划管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"处罚方式","menuJump":"列表","tableName":"chufafangshi"}],"menu":"处罚方式管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"行驶方向","menuJump":"列表","tableName":"xingshifangxiang"}],"menu":"行驶方向管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","报表"],"menu":"移动电子违章信息管理列表","menuJump":"列表","tableName":"yidongdianziweizhangxinxiguanli"}],"menu":"移动电子违章信息管理模块"},{"child":[{"buttons":["查看","报表"],"menu":"卡口电子违章信息管理列表","menuJump":"列表","tableName":"kakoudianziweizhangxinxiguanli"}],"menu":"卡口电子违章信息管理模块"},{"child":[{"buttons":["查看"],"menu":"支队管理列表","menuJump":"列表","tableName":"zhiduiguanli"}],"menu":"支队管理模块"},{"child":[{"buttons":["查看"],"menu":"大队管理列表","menuJump":"列表","tableName":"daduiguanli"}],"menu":"大队管理模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","打印","报表"],"menu":"移动电子违章信息管理","menuJump":"列表","tableName":"yidongdianziweizhangxinxiguanli"}],"menu":"移动电子违章信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表","打印"],"menu":"卡口电子违章信息管理","menuJump":"列表","tableName":"kakoudianziweizhangxinxiguanli"}],"menu":"卡口电子违章信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","打印"],"menu":"处罚决定书","menuJump":"列表","tableName":"chufajuedingshu"}],"menu":"处罚决定书管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","报表"],"menu":"移动电子违章信息管理列表","menuJump":"列表","tableName":"yidongdianziweizhangxinxiguanli"}],"menu":"移动电子违章信息管理模块"},{"child":[{"buttons":["查看","报表"],"menu":"卡口电子违章信息管理列表","menuJump":"列表","tableName":"kakoudianziweizhangxinxiguanli"}],"menu":"卡口电子违章信息管理模块"},{"child":[{"buttons":["查看"],"menu":"支队管理列表","menuJump":"列表","tableName":"zhiduiguanli"}],"menu":"支队管理模块"},{"child":[{"buttons":["查看"],"menu":"大队管理列表","menuJump":"列表","tableName":"daduiguanli"}],"menu":"大队管理模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
