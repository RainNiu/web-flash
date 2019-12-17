package cn.enilu.flash.bean.enumeration;

/**
 * 权限编码列表<br>
 * 权限编码需要和菜单中的菜单编码一致
 * @author ：enilu
 * @date ：Created in 2019/7/31 11:05
 */
public interface Permission {

    //系统管理
    String DICT = "dict";
    String DICT_EDIT = "dictEdit";
    String LOG = "log";
    String LOG_CLEAR = "logClear";
    String LOGIN_LOG = "loginLog";
    String LOGIN_LOG_CLEAR = "loginLogClear";
    String ROLE = "role";
    String ROLE_EDIT = "roleEdit";
    String ROLE_DEL = "roleDelete";
    String MENU = "menu";
    String MENU_EDIT = "menuEdit";
    String MENU_DEL = "menuDelete";
    String USER = "mgr";
    String USER_EDIT = "mgrEdit";
    String USER_DEL = "mgrDelete";
    String DEPT = "dept";
    String DEPT_EDIT = "deptEdit";
    String DEPT_DEL = "deptDelete";

}
