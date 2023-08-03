public class Task2 {
    public static void main(String[] args) {
        Object[] criteria = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true};
        String query = createQuery("cars", criteria);
        System.out.println(query);
    }

    public static String createQuery(String tableName, Object[] params) {
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM ").append(tableName).append(" WHERE ");

        boolean isFirstParam = true;

        for (int i = 0; i < params.length; i += 2) {
            Object key = params[i];
            Object value = params[i + 1];

            if (value != null) {
                if (!isFirstParam) {
                    query.append(" AND ");
                } else {
                    isFirstParam = false;
                }

                query.append(key).append(" = '").append(value).append("'");
            }
        }

        return query.toString();
    }
}
