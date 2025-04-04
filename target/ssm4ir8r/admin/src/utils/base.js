const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm4ir8r/",
            name: "ssm4ir8r",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm4ir8r/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智能道路交通管理系统"
        } 
    }
}
export default base
