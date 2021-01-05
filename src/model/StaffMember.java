/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Connectivity.ConnectionClass;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tommy
 */
public class StaffMember extends SystemUser{
    String name;
    public boolean SearchStaffMember(String search_c, String search_t){return false;}
    public boolean EditStaffMember(int Staffmember_id){return false;}
    public boolean DeleteStaffMember(String username) throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        String sql = "DELETE FROM staffmember WHERE username = '"+username+"'";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        return true;}
}


