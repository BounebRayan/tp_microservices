package com.directi.training.ocp.work;

public class SpaceSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotBusy(int resourceId) {
        // Logic to mark space slot as busy
    }

    private void markSpaceSlotFree(int resourceId) {
        // Logic to mark space slot as free
    }

    private int findFreeSpaceSlot() {
        // Logic to find a free space slot
        return 0;
    }
}
