package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void prompt_FirstName() {
        String f_name = "Sitara";
        ByteArrayInputStream fi_name = new ByteArrayInputStream(f_name.getBytes());
        String fir_name = Menu.prompt_FirstName(fi_name);
        assertEquals(f_name,fir_name);
    }

    @Test
    void prompt_LastName() {
        String l_name = "Meherzad";
        ByteArrayInputStream la_name = new ByteArrayInputStream(l_name.getBytes());
        String las_name = Menu.prompt_FirstName(la_name);
        assertEquals(l_name,las_name);
    }

    @Test
    void prompt_Street() {
        String s_name = "1222 abcdef st";
        ByteArrayInputStream st_name = new ByteArrayInputStream(s_name.getBytes());
        String ste_name = Menu.prompt_FirstName(st_name);
        assertEquals(s_name,ste_name);
    }

    @Test
    void prompt_City() {
        String c_name = "Hayward";
        ByteArrayInputStream ci_name = new ByteArrayInputStream(c_name.getBytes());
        String cit_name = Menu.prompt_FirstName(ci_name);
        assertEquals(c_name,cit_name);
    }

    @Test
    void prompt_State() {
        String s_name = "CA";
        ByteArrayInputStream st_name = new ByteArrayInputStream(s_name.getBytes());
        String sta_name = Menu.prompt_FirstName(st_name);
        assertEquals(s_name,sta_name);
    }

    @Test
    void prompt_Zip() {
        String my_zip = "95205";
        ByteArrayInputStream the_zip = new ByteArrayInputStream(my_zip.getBytes());
        int zipcode = Menu.prompt_Zip(the_zip);
        assertEquals(Integer.parseInt(my_zip),zipcode);
    }

    @Test
    void prompt_Telephone() {
        String t_num = "5101234567";
        ByteArrayInputStream te_num = new ByteArrayInputStream(t_num.getBytes());
        String tel_num = Menu.prompt_FirstName(te_num);
        assertEquals(t_num,tel_num);
    }

    @Test
    void prompt_Email() {
        String e_add = "smeherzad@gmail.com";
        ByteArrayInputStream em_add = new ByteArrayInputStream(e_add.getBytes());
        String ema_add = Menu.prompt_FirstName(em_add);
        assertEquals(e_add,ema_add);
    }

    @Test
    void promptMenu() {
    }
}