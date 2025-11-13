-- 코드를 입력하세요
SELECT a.TITLE, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS, date_format(b.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
from used_goods_board a inner join used_goods_reply b
on a.board_id = b.board_id where a.created_date like '2022-10-%'
order by b.created_date asc, a.title asc;
# Y: 4자리, y: 2자리