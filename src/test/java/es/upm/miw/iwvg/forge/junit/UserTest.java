package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before(){
        this.user = new User(1, "juan", "ramírez");
    }

    @Test
    void testFullName(){
        assertEquals("Juan Ramírez", this.user.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("J.", this.user.initials());
    }

    @Test
    void testGetNumber(){
        assertEquals(1, this.user.getNumber());
    }

    @Test
    void testGetName(){
        assertEquals("Juan", this.user.getName());
    }

    @Test
    void testGetFamilyName(){
        assertEquals("Ramírez", this.user.getFamilyName());
    }


}
