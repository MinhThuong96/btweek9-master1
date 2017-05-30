package bt_week09.dao;
//tạo kho chứa dữ liệu

import org.springframework.data.repository.CrudRepository;
import bt_week09.model.Post;

//1 model tương ứng vs 1 reposi
public interface PostRepository extends CrudRepository<Post, Integer> { //thay đổi Post :kiểu dữ liệu model, Integer :kiểu dữ liệu id

}
