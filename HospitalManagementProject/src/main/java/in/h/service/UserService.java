package in.h.service;

import in.h.entity.User;

public interface UserService {
    public boolean registerUser(User user);
    public User loginUser(String email , String pass);
    public User CheckUser(String email);
}
