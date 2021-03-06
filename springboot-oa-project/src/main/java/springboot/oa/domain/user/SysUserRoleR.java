package springboot.oa.domain.user;

import java.io.Serializable;
import java.util.List;

public class SysUserRoleR implements Serializable {
    private String id;

    private String userId;

    private String roleId;

    private List<String> listSysUserRoleR;

    public List<String> getListSysUserRoleR() {
        return listSysUserRoleR;
    }

    public void setListSysUserRoleR(List<String> listSysUserRoleR) {
        this.listSysUserRoleR = listSysUserRoleR;
    }

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}