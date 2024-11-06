package com.directi.training.ocp.work;

public interface Resource {
    int allocate();

    void free(int resourceId);
}
