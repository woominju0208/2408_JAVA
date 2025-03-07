package oop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
        private MyDAO myDAO;

        public UserDAO() {
            this.myDAO = new MyDAO();
        }

        public List<UserDTO> getUsers(int limit, int offset) {
            List<UserDTO> users = new ArrayList<>();
            String sql = "select * from users limit ? offset ?";

            try(
                Connection conn = this.myDAO.getConnection();  // connection 객체 획득
                PreparedStatement ps = conn.prepareStatement(sql);
            ) {
              // 1,2 는 ?의 순서를 뜻한다.
                ps.setInt(1, limit);
                ps.setInt(2, offset);

                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        UserDTO user = new UserDTO();
                        user.setUserId(rs.getLong("user_id"));
                        user.setName(rs.getString("name"));
                        user.setAccount(rs.getString("account"));
                        user.setPassword(rs.getString("password"));
                        user.setProfile(rs.getString("profile"));
                        user.setGender(rs.getString("gender"));
                        user.setRefreshToken(rs.getString("refresh_token"));
                        user.setCreatedAt(rs.getString("created_at"));
                        user.setUpdatedAt(rs.getString("updated_at"));
                        user.setDeletedAt(rs.getString("deleted_at"));

//                        add해서 user 안에 넣어줘야 한다.
                        users.add(user);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
                return users;
        }
}
