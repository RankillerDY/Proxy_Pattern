## Khái niệm

- Có thể bạn đã từng nghe về những khái niệm như tường lửa hay proxy HTTP trong mạng máy tính (giúp tăng tốc nhờ lưu đệm lại dữ liệu, nâng cao trải nghiệm sử dụng, hoặc chặn quảng cáo và hạn chế truy cập). Hãy tưởng tượng nó như một lớp bảo vệ bên ngoài giúp kiểm soát quyền truy cập vào nội dung bên trong, chỉ cho phép truy cập thông qua proxy.
- Proxy có thể được định nghĩa là một lớp trung gian hoặc đại diện, mà khi muốn truy cập đến một đối tượng cụ thể, chúng ta phải thông qua lớp Proxy này. Proxy sẽ thực hiện việc đại diện cho đối tượng thực thi những phương thức cần thiết, đồng thời chúng ta có thể định nghĩa lại cách thức thực hiện các phương thức đó sao cho phù hợp.

## Các thành phần

- **Subject**: Đây là một interface định nghĩa các phương thức giao tiếp với client, đồng thời xác định các phương thức chung để RealSubject và Proxy có thể thực hiện. Điều này cho phép Proxy có thể sử dụng những phương thức này thay cho RealSubject.

- **Proxy**: Đây là một class có nhiệm vụ thực hiện các bước kiểm tra và gọi đến đối tượng RealSubject để thực thi các thao tác sau khi đã hoàn tất quá trình kiểm tra. Proxy đóng vai trò như một tham chiếu đến RealSubject, và có thể thực hiện các giao diện tương tự như RealSubject. Proxy cũng quản lý quyền truy cập vào RealSubject và có thể tạo, xóa, hoặc thay thế đối tượng này nếu cần thiết.

- **RealSubject**: Là class chính thực hiện các thao tác cụ thể. Đây chính là đối tượng mà Proxy đại diện, và nó thực hiện các hành động thực sự.

- **Client**: Đối tượng này đại diện cho người sử dụng, không cần trực tiếp làm việc với RealSubject mà thông qua Proxy để thực hiện các thao tác cần thiết.

## Tài liệu tham khảo

- Các loại Proxy: [https://www.javatpoint.com/proxy-pattern](https://www.javatpoint.com/proxy-pattern)
- [https://sourcemaking.com/design_patterns/proxy](https://sourcemaking.com/design_patterns/proxy)
- [https://refactoring.guru/design-patterns/proxy](https://refactoring.guru/design-patterns/proxy)

