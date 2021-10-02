package de.bohnottensen.cleancodedemo;

import de.bohnottensen.cleancodedemo.helper.Cryptographer;
import de.bohnottensen.cleancodedemo.helper.Session;
import de.bohnottensen.cleancodedemo.helper.User;
import de.bohnottensen.cleancodedemo.helper.UserGateway;

public class HaveNoSideEffects {

  private Cryptographer cryptographer;

  public HaveNoSideEffects(Cryptographer cryptographer) {
    this.cryptographer = cryptographer;
  }

  public boolean checkPassword(String username, String password) {
    User user = UserGateway.findByName(username);
    if (user != User.NULL) {
      String codedPhrase = user.getPhraseEncodedByPassword();
      String phrase = cryptographer.decrypt(codedPhrase, password);
      if ("ValidPassword".equals(phrase)) {
        Session.initialize();
        return true;
      }
    }
    return false;
  }
}
