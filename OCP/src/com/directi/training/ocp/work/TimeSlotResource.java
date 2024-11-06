package com.directi.training.ocp.work;

public class TimeSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private void markTimeSlotBusy(int resourceId) {
        // Logic to mark time slot as busy
    }

    private void markTimeSlotFree(int resourceId) {
        // Logic to mark time slot as free
    }

    private int findFreeTimeSlot() {
        // Logic to find a free time slot
        return 0;
    }
}
