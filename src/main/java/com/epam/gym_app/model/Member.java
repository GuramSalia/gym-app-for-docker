package com.epam.gym_app.model;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Member implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String id;
    private String username;
}
