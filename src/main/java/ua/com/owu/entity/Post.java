package ua.com.owu.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String postTitle;
    private String postText;
    @ManyToOne(fetch = FetchType.LAZY)
    private Blog blog;

}
