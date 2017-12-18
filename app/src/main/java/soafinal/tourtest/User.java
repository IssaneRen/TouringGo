package soafinal.tourtest;

import java.io.Serializable;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by 杨 on 2017/12/17.
 */

public class User extends BmobUser implements Serializable {
    private Boolean sex;
    private String nick;
    private Integer age;
    BmobFile avatar=new BmobFile();
    public boolean getSex(){
        return this.sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
