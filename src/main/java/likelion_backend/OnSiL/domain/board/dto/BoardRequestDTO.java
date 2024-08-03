package likelion_backend.OnSiL.domain.board.dto;

import likelion_backend.OnSiL.domain.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardRequestDTO {
    private String title;
    private String content;
    private Board.Category category;
    private String image;
    private String writer;


    public Board toEntity() {
        Board board = new Board();
        board.setTitle(this.title);
        board.setContent(this.content);
        board.setCategory(this.category);
        board.setImage(this.image);
        board.setWriter(this.writer);
        return board;
    }
}