package session15_equals_hashcode_enum_generics.practice.enums;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true);

    private boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }
}
