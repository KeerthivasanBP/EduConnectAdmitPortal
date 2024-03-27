package eduadmit.eduadmit.model.enumerate;

import lombok.RequiredArgsConstructor;
import lombok.Getter;
@RequiredArgsConstructor
public enum Permission 
{
    ADMIN_READ(permission:"admin:read"),
    ADMIN_UPDATE(permission:"admin:update"),
    @Getter
    private final String permission;
}
