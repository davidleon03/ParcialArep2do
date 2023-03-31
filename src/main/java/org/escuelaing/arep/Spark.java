package org.escuelaing.arep;
import static org.escuelaing.arep.Collatz.collatzProblem;
import static org.escuelaing.arep.Collatz.response;
import static spark.Spark.*;
public class Spark {

    public static void main(String[] args) {
        port(getPort());
        get("/:collatzsequence", (req, res) -> {
            res.status(200);
            res.header("Access-Control-Allow-Origin", "*");
            res.type("application/json");
            return response(Integer.parseInt(req.params(":collatzsequence")));
        });
    }
    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
