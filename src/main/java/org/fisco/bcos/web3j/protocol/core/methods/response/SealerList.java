package org.fisco.bcos.web3j.protocol.core.methods.response;

import java.util.List;
import org.fisco.bcos.web3j.protocol.core.Response;

public class SealerList extends Response<List<String>> {

    public List<String> getSealerList() {
        return getResult();
    }
}