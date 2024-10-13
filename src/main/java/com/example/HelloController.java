package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //@Autowired
    //NamedParameterJdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    String hello() {
        return System.getProperty("java.version") + System.getProperty("os.name");
    }
    static class Result {

        private final int left;
        private final int right;
        private final long answer;
        
        public Result(int left, int right, long answer) {
            this.left = left;
            this.right = right;
            this.answer = answer;
        }

        public int getRight() {
            return right;
        }

        public int getLeft() {
            return left;
        }

        public long getAnswer() {
            return answer;
        }
        
    }

    // SQL sample
    // @RequestMapping("calc")
    // Result calc(@RequestParam int left, @RequestParam int right) {
    //     MapSqlParameterSource source = new MapSqlParameterSource()
    //             .addValue("left", left)
    //             .addValue("right", right);
    //     return jdbcTemplate.queryForObject("SELECT :left + :right AS answer", source,
    //             (rs, rowNum) -> new Result(left, right, rs.getLong("answer")));
    // }
}
