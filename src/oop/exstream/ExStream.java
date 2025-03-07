package oop.exstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExStream {
    public static void main(String[] args) {
        BoardDTO board1 = new BoardDTO(1, "title1", "content1");
        BoardDTO board2 = new BoardDTO(2, "title2", "content2");
        BoardDTO board3 = new BoardDTO(3, "title3", "content3");

        List<BoardDTO> boards = new ArrayList<BoardDTO>();
        boards.add(board1);
        boards.add(board2);
        boards.add(board3);

//        스트림 생성
        Stream<BoardDTO> streamBoards = boards.stream();
        List<BoardDTO> filterList =
                streamBoards.filter(board -> board.getBoardId() %2 == 0)
                .toList();

        List<BoardDTO> exList = new ArrayList<>();
//        향상된 for문 for(변수이름 : 반복돌릴 데이터)
        for(BoardDTO board : filterList) {
            if(board.getBoardId() % 2 == 0) {
                exList.add(board);
            }
        }


//        for(int i =0; i < boards.size(); i++){
//            System.out.println(boards.get(i).getBoardName());
//        }
    }
}

class BoardDTO {
    private long boardId;
    private String boardName;
    private String boardContent;

    public BoardDTO(long boardId, String boardName, String boardContent) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardContent = boardContent;
    }

    public long getBoardId() {
        return boardId;
    }

    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }
}
