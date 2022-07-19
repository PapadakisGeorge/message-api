package com.example.message.api.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Message {

    @Id
    @SequenceGenerator(
            name = "message_id_sequence",
            sequenceName = "message_id_sequence"
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "message_id_sequence"
    )
    private Integer id;

    @NotBlank(message = "Title should be non empty")
    @NotNull(message = "Title should be non null")
    private String messageTitle;

    @NotBlank(message = "Body should be non empty")
    @NotNull(message = "Body should be non null")
    private String messageBody;

    @NotBlank(message = "Sender should be non empty")
    @NotNull(message = "Sender should be non null")
    private String messageSender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Message message = (Message) o;
        return id != null && Objects.equals(id, message.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
