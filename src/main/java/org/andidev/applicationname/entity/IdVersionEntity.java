package org.andidev.applicationname.entity;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@EqualsAndHashCode(of = "id")
@MappedSuperclass
public class IdVersionEntity extends  AbstractPersistable<Long> {
    @Version
    @Setter(AccessLevel.PROTECTED)
    private Long version;
}
