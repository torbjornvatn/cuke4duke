package cuke4duke.internal.jvmclass;

import cuke4duke.Transform;

public class MyTransforms {

    @Transform
    public boolean overrideBooleanTransform(String yes) {
        if (yes.equals("yes"))
            return true;
        else
            return false;
    }

}