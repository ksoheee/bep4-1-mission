package com.back.global.shared.post.event;

import com.back.global.shared.post.dto.PostCommentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostCommentCreateEvent {
    private final PostCommentDto postcomment;
}
