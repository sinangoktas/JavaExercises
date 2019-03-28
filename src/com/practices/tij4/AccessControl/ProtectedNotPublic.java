package com.practices.tij4.AccessControl;

import com.practices.tij4.AccessControl.local.AccessControl;

public class ProtectedNotPublic extends AccessControl {

    public static void main(String[] args) {
        AccessControl ac = new AccessControl();
        // can not call protectedMethod from ac

        ProtectedNotPublic pnp = new ProtectedNotPublic();
        pnp.protectedMethod();

    }
}
