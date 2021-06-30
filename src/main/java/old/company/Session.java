package old.company;

import lombok.Data;

import java.util.List;

@Data
public class Session{
    private String session_id;
    private String date;
    private int available_capacity;
    private int min_age_limit;
    private String vaccine;
    private List<String> slots;
}