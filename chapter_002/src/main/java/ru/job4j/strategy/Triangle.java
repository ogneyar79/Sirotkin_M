package ru.job4j.strategy;
import static java.lang.System.getProperty;

public class Triangle implements IShape {


        public String getResult() {
                return result;
        }

        private String result;

        /**
         * method that is realisation interface, outputting triangle at console.
         *
         * @ return result
         */
    @Override
public String pic() {

        StringBuilder triangleBuilder = new StringBuilder();

        triangleBuilder.append("+"+"    ");
        triangleBuilder.append(getProperty("line.separator"));
        triangleBuilder.append("++"+"   ");
        triangleBuilder.append(getProperty("line.separator"));
        triangleBuilder.append("+"+" "+"+"+"  ");
        triangleBuilder.append(getProperty("line.separator"));
        triangleBuilder.append("+"+"  "+"+"+" ");
        triangleBuilder.append(getProperty("line.separator"));
        triangleBuilder.append("+++++");
        triangleBuilder.append(getProperty("line.separator"));
            result = triangleBuilder.toString();
                    System.out.println(result);
        return result;
}


}