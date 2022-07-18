import { useState, useEffect } from "react";

import CardList from "./components/card-list/card-list.component";
import SearchBox from "./components/search-box/search-box.component";
import "./App.css";

const App = () => {
  const [searchField, setSearchField] = useState("");
  const [books, setBooks] = useState([]);
  const [filteredBooks, setFilterBooks] = useState(books);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/users")
      .then((response) => response.json())
      .then((users) => setBooks(users));
  }, []);

  useEffect(() => {
    const newFilteredBooks = books.filter((book) => {
      return book.name.toLocaleLowerCase().includes(searchField);
    });

    setFilterBooks(newFilteredBooks);
  }, [books, searchField]);

  const onSearchChange = (event) => {
    const searchFieldString = event.target.value.toLocaleLowerCase();
    setSearchField(searchFieldString);
  };

  return (
    <div className="App">
      <h1 className="app-title">My Shelf</h1>
      <SearchBox
        className="books-search-box"
        onChangeHandler={onSearchChange}
        placeholder="search books"
      />
      <CardList books={filteredBooks} />
    </div>
  );
};

export default App;
