package rest;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pm/addressBook")
@Api("通讯录")
public class AddressBook {
    private final AddressBook addressBook;

    public AddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }
}
