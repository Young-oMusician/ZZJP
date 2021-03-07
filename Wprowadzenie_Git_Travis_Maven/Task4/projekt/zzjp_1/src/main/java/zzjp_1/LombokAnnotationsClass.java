package zzjp_1;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class LombokAnnotationsClass {
    @Getter @Setter @EqualsAndHashCode.Exclude private int field;
    @Getter @Setter private String forEquality;

    public LombokAnnotationsClass(int field, String forEquality) {
        this.field = field;
        this.forEquality = forEquality;
    }
}
