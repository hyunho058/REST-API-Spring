package hello.upload.controller.notice.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Schema(description = "공지사항 업데이트 request")
public class NoticeUpdateRequest {
    @NotNull
    @Schema(description = "수정할 게시물 no", example = "1", required = true)
    Long NoticeNo;

    @NotNull
    @Schema(description = "공지사항 제목", example = "수정된 공지사항입니다", required = true)
    String title;

    @NotNull
    @Schema(description = "공지사항 내용", example = "수정된 내용입니다", required = true)
    String contents;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "공지 시작날짜 (yyyy-MM-dd HH:mm:ss)", example = "2022-03-04 11:00:00", required = true)
    LocalDateTime noticeStartDate;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Schema(description = "공지 종료날짜 yyyy-MM-dd HH:mm:ss)", example = "2022-04-04 11:00:00", required = true)
    LocalDateTime noticeEndDate;

}
