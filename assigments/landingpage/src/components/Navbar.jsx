import React from 'react';

const Navbar =() => {
  return (
    <div className="w-full">
      <div className="bg-gray-200 py-2 flex justify-between items-center px-4">
        <div className="text-sm text-gray-700">Contact: +977 982-1270836</div>
        <div className="text-sm text-gray-700">Email: info@example.com</div>
      </div>
      <nav className="bg-white shadow-md">
        <div className="container mx-auto flex justify-between items-center py-4 px-4">
          <div className="flex items-center">
            <img src="#" alt="Logo" className="h-10 w-10 mr-2" />
            <span className="text-xl font-bold">Logo</span>
          </div>
          <div className="flex space-x-8">
            <a href="#" className="text-gray-700 hover:text-purple-600">
              Home
            </a>
            <a href="#" className="text-gray-700 hover:text-purple-600">
              About
            </a>
            <a href="#" className="text-gray-700 hover:text-purple-600">
              Courses
            </a>
            <a href="#" className="text-gray-700 hover:text-purple-600">
              E-Books
            </a>
            <a href="#" className="text-gray-700 hover:text-purple-600">
              Quiz
            </a>
            <a href="#" className="text-gray-700 hover:text-purple-600">
              Blog
            </a>
           
            <a href="#" className="text-gray-700 hover:text-purple-600">
              Contact
            </a>
          </div>
          <div>
            <button className="bg-purple-600 text-white px-8 py-2 rounded-full">
              Login
            </button>
          </div>
        </div>
      </nav>
    </div>
  );
}

export default Navbar;