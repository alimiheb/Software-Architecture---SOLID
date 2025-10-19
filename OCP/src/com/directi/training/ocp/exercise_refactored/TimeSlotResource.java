
package com.directi.training.ocp.exercise_refactored;
    
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

    private int findFreeTimeSlot() {
        return 0;
    }

    private void markTimeSlotFree(int resourceId) {
    }

   

    private void markTimeSlotBusy(int resourceId) {
    }
    
}
