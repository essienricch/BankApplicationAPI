package bank.semicolon.dto.accountDto.requests;


import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class UserRemoveAccountRequest {

    private String emailAddress;
    private String accountNumber;
}
