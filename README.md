Đây là bài cuối kì 1 năm nhất. Làm về dự án quản lí thông tin học sinh thpt thi tốt nghiệp cuối cấp. Bài làm hơi sơ sài về giao diện, nó không đẹp mắt cho lắm.
Bài gồm các chức năng sau:
- thêm, sửa, xóa, tìm kiếm, thoát
Bài được kết nối với mySQL để lưu thông tin học sinh cũng như thông tin đăng nhập tài khoản.
Để kết nối Java với MySQL bằng JDBC, giả sử bạn đã tạo bảng trong MySQL, bạn cần làm theo 4 bước sau:
 - Tải file mới nhất mysql-connector-java-x.y.zz.zip về máy tại https://dev.mysql.com/downloads/connector/j/, giải nén ra được file mysql-connector-java-x.y.zz-bin.jar.
 - Add thư viện JDBC Driver mysql-connector-java-x.y.zz-bin.jar vào project.
 - Gọi phương thức Class.forName("com.mysql.jdbc.Driver").
 - Gọi phương thức DriverManager.getConnection() để kết nối đến cơ sở dữ liệu MySQL
Trong bước 3 ta cụ thể như sau:
  - Nháy chuột phải vào 1 project ta muốn làm.
  - Sau đó chọn Build Path -> Configure
  - Vào trang mục Java Build Path, chọn Libraries
  - Nhấp vào Classpath -> Add external JARs.. -> chọn file mysql-connector-java-x.y.zz-bin.jar mới tải về. 
