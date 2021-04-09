package io.vertx.codegen.rxjava3;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface MethodWithCompletable {

  void doSomethingWithResult(Handler<AsyncResult<Void>> handler);

}
