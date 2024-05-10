package com.demo.projeto_pi3a.logical;

import org.json.JSONArray;

public class Message implements MessageJSONFormat {

    JSONArray message_history;

    String message_not_storaged;

    public JSONArray getMessage_history() {
        return message_history;
    }

    public String getMessage_not_storaged() {
        return message_not_storaged;
    }

    // implementar os outros métodos aqui referente às mensagens e seus dados

}
